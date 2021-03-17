import UIKit
@objc(Noke)
class Noke: NSObject {
    @objc(multiply:withB:withResolver:withRejecter:)
    func multiply(a: Float, b: Float, resolve:RCTPromiseResolveBlock,reject:RCTPromiseRejectBlock) -> Void {
        resolve(a*b)
    }
    
    @objc func openNoke() {
        DispatchQueue.main.async {
            let bundle: Bundle? = Bundle.main.path(forResource: "Resources", ofType: "bundle")
                .flatMap(Bundle.init(path:))
            print("Path `\(bundle)")
//            let rootVC = UIApplication.shared.keyWindow?.rootViewController
//            let vc = NokeViewController(nibName: "NokeView", bundle:bundle)
//            rootVC?.present(vc, animated: true, completion: nil)
        }
    }
    
}
