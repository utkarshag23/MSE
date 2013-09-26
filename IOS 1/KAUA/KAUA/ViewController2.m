//
//  ViewController2.m
//  KAUA
//
//  Created by MSE on 19/09/13.
//  Copyright (c) 2013 MSE. All rights reserved.
//

#import "ViewController2.h"
#import "ViewController.h"



@implementation ViewController2

- (id)initWithNibName:(NSString *)nibNameOrNil bundle:(NSBundle *)nibBundleOrNil
{
    self = [super initWithNibName:nibNameOrNil bundle:nibBundleOrNil];
    if (self) {
        // Custom initialization
    }
    return self;
}

- (void)viewDidLoad
{
    [super viewDidLoad];
    
    // Do any additional setup after loading the view from its nib.
}

- (void)didReceiveMemoryWarning
{
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}



- (IBAction)onback:(id)sender {
    
    ViewController *fir=[[ViewController alloc]init];
    [self presentModalViewController:fir animated:YES];

}
@end
