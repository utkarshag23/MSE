//
//  ViewController.h
//  KAUA
//
//  Created by MSE on 19/09/13.
//  Copyright (c) 2013 MSE. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface ViewController : UIViewController
{
    IBOutlet UITextField *user;
    IBOutlet UITextField *pwd;
}
@property (strong, nonatomic) IBOutlet UITextField *user;
@property (strong, nonatomic) IBOutlet UITextField *pwd;

- (IBAction)onClick:(id)sender;

@end
