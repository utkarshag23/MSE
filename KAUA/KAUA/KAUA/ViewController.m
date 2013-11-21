//
//  ViewController.m
//  KAUA
//
//  Created by MSE on 19/09/13.
//  Copyright (c) 2013 MSE. All rights reserved.
//

#import "ViewController.h"

#import "ViewController2.h"
@implementation ViewController
@synthesize user,pwd;


- (void)viewDidLoad
{
    [super viewDidLoad];
	// Do any additional setup after loading the view, typically from a nib.
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

- (IBAction)onClick:(id)sender
{

     ViewController2 *myController2 = [[ViewController2 alloc] init];
    if ([user.text isEqualToString:pwd.text])
        {
            
           /* UIAlertView *alr=[[UIAlertView alloc]initWithTitle:@"dilog"message:@"valid" delegate:nil cancelButtonTitle:@"cancel" otherButtonTitles:nil, nil];
            [alr show];*/
       [self presentModalViewController:myController2 animated:YES];
        
    
        }
    else
    {
       
        ViewController *fir=[[ViewController alloc]init];
        [self presentModalViewController:fir animated:YES];
        
        /*UIAlertView *alr=[[UIAlertView alloc]initWithTitle:@"dilog"message:@"invalid" delegate:nil cancelButtonTitle:@"cancel" otherButtonTitles:nil, nil];
        [alr show];*/
       }
    
}
@end
