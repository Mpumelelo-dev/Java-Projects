#include <iostream>
#include <string>
#include <vector>


class diamond
{
    public:
    static std::vector<std::vector<int>> getDiamondPoints(int sizeOfShape, int xCenter, int yCenter)
    {
        std::vector<std::vector<int>> coordinates(4 * (sizeOfShape - 1) + 1,std::vector<int>(2));
        if ((xCenter >= 1 && xCenter <= 79) && (yCenter >= 1 && yCenter <= 25) && (sizeOfShape >= 2 && yCenter <= 9))
        {
            coordinates[0][0] = xCenter;
            coordinates[0][1] = yCenter;
            int yCoordinate = yCenter - (sizeOfShape - 1);
            int xCoordinate = xCenter;
            coordinates[1][0] = xCoordinate;
            coordinates[1][1] = yCoordinate;
            int sideCenter = ((coordinates.size() / 2) / 2) + 2;
            for (int i = 2; i < (coordinates.size() / 2) + 2; i++)
            {
                if (i < sideCenter)
                {
                    xCoordinate--;
                    yCoordinate++;
                    coordinates[i][0] = xCoordinate;
                    coordinates[i][1] = yCoordinate;
                }
                else 
                {
                    xCoordinate++;
                    yCoordinate++;
                    coordinates[i][0] = xCoordinate;
                    coordinates[i][1] = yCoordinate;
                }
            }
            yCoordinate = yCenter - (sizeOfShape - 1);
            xCoordinate = xCenter;
            sideCenter = ((coordinates.size() / 2) / 2) + (coordinates.size() / 2) + 2;
            for (int i = ((coordinates.size() / 2) + 2); i < coordinates.size(); i++)
            {
                if (i < sideCenter)
                {
                    xCoordinate++;
                    yCoordinate++;
                    coordinates[i][0] = xCoordinate;
                    coordinates[i][1] = yCoordinate;
                }
                else 
                {
                    xCoordinate--;
                    yCoordinate++;
                    coordinates[i][0] = xCoordinate;
                    coordinates[i][1] = yCoordinate;
                }
            }
        }
        return coordinates;
    }
    static std::vector<std::vector<std::string>> drawDiamond(std::vector<std::vector<std::string>> &canvas, std::vector<std::vector<int>> &diamondCoordinates)
    {
        for (int i = 0; i < diamondCoordinates.size(); i++)
        {
            int x = diamondCoordinates[i][0] - 1;
            int y = diamondCoordinates[i][1] - 1;
            if ((x >= 0 && x < 79) && (y >= 0 && y < 25))
            {
                canvas[y][x] = "$";
            }
        }
        return canvas;
    }
    static std::vector<std::vector<std::string>> getCanvas()
    {
        std::vector<std::vector<std::string>> canvas(25,std::vector<std::string>(79));
        int count = 1;
        
        for (int i = 0; i < 25; i++)
        {
            for (int j = 0; j < 79; j++)
            {
                switch (count){
                	//relevant numbering for column
                    case 10:
                        canvas[i][j] = "1";
                        break;
                    case 20:
                        canvas[i][j] = "2";
                        break;
                    case 30:
                        canvas[i][j] = "3";
                        break;
                    case 40:
                        canvas[i][j] = "4";
                        break;
                    case 50:
                        canvas[i][j] = "5";
                        break;
                    case 60:
                        canvas[i][j] = "6";
                        break;
                    case 70:
                        canvas[i][j] = "7";
                        break;
                         case 1:
                         	//relevant numbering for row
                      canvas[i][j] ="=";
                        canvas[9][j] = "1";
                        canvas[19][j] = "2";
                        break;
                    default:
                        canvas[i][j] = "=";
                        break;
                                    }
                count++;
            }
            count = 1;
        }
        return canvas;
    }
    static void main(std::vector<std::string> &args)
    {
    	//using test 1 to output
        int sizeOfShape = 6;
        int xCenter = 30;
        int yCenter = 9;
        std::vector<std::vector<int>> locations = diamond::getDiamondPoints(sizeOfShape, xCenter, yCenter);
        std::vector<std::vector<std::string>> canvas = diamond::getCanvas();
        canvas = diamond::drawDiamond(canvas, locations);
        for (int i = 0; i < 25; i++)
        {
            for (int j = 0; j < 79; j++)
            {
                std::cout << canvas[i][j];
            }
            std::cout << std::endl;
        }
    }
};
int main(int argc, char **argv){
	std::vector<std::string> parameter(argv + 1, argv + argc);
	diamond::main(parameter); 
	return 0;
};
