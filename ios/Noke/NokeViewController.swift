//
//  NokeViewController.swift
//  Noke
//
//  Created by Hein Htet on 16/03/2021.
//  Copyright © 2021 Facebook. All rights reserved.
//

import UIKit

class NokeViewController : UIViewController {
    override func viewDidLoad() {
        super.viewDidLoad()
        let uiView = UIView(frame: CGRect(x: 0, y: 0, width: 200, height: 200))
        uiView.backgroundColor = #colorLiteral(red: 0.521568656, green: 0.1098039225, blue: 0.05098039284, alpha: 1)
        self.view.addSubview(uiView)
    }
}
