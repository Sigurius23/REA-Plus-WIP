package live.hms.video.media.capturers.camera;

import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import l83.C23454a0;
import live.hms.video.media.capturers.camera.utils.ImageCaptureModel;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC32271e(m100429c = "live.hms.video.media.capturers.camera.CameraControl$takePictureInternal$2$3$onCaptureCompleted$1", m100430f = "CameraControl.kt", m100431l = {}, m100432m = "invokeSuspend")
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 0, 0})
public final class CameraControl$takePictureInternal$2$3$onCaptureCompleted$1 extends AbstractC32275i implements InterfaceC4351m {
    final /* synthetic */ InterfaceC30057d<ImageCaptureModel> $cont;
    final /* synthetic */ ArrayBlockingQueue<Image> $imageQueue;
    final /* synthetic */ TotalCaptureResult $result;
    final /* synthetic */ Long $resultTimestamp;
    final /* synthetic */ AtomicBoolean $resumed;
    final /* synthetic */ C22669g0 $timeoutRunnable;
    int label;
    final /* synthetic */ CameraControl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CameraControl$takePictureInternal$2$3$onCaptureCompleted$1(ArrayBlockingQueue<Image> arrayBlockingQueue, Long l7, AtomicBoolean atomicBoolean, CameraControl cameraControl, InterfaceC30057d<? super ImageCaptureModel> interfaceC30057d, TotalCaptureResult totalCaptureResult, C22669g0 c22669g0, InterfaceC30057d<? super CameraControl$takePictureInternal$2$3$onCaptureCompleted$1> interfaceC30057d2) {
        super(2, interfaceC30057d2);
        this.$imageQueue = arrayBlockingQueue;
        this.$resultTimestamp = l7;
        this.$resumed = atomicBoolean;
        this.this$0 = cameraControl;
        this.$cont = interfaceC30057d;
        this.$result = totalCaptureResult;
        this.$timeoutRunnable = c22669g0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
        return new CameraControl$takePictureInternal$2$3$onCaptureCompleted$1(this.$imageQueue, this.$resultTimestamp, this.$resumed, this.this$0, this.$cont, this.$result, this.$timeoutRunnable, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        return ((CameraControl$takePictureInternal$2$3$onCaptureCompleted$1) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        Image imageTake;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(obj);
        while (true) {
            imageTake = this.$imageQueue.take();
            if (Build.VERSION.SDK_INT < 29 || imageTake.getFormat() == 1768253795) {
                break;
            }
            long timestamp = imageTake.getTimestamp();
            Long l7 = this.$resultTimestamp;
            if (l7 != null && timestamp == l7.longValue()) {
                break;
            }
            imageTake.close();
        }
        boolean z4 = false;
        boolean zCompareAndSet = this.$resumed.compareAndSet(false, true);
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (!zCompareAndSet) {
            imageTake.close();
            return c23454a0;
        }
        CameraControl.takePictureInternal$lambda$22$releaseCaptureResources(this.$timeoutRunnable, this.this$0, this.$imageQueue);
        Context context = this.this$0.getContext();
        CameraCaptureSession currentCameraSession = this.this$0.getCurrentCameraSession();
        AbstractC22676k.m65747g(currentCameraSession);
        String id4 = currentCameraSession.getDevice().getId();
        AbstractC22676k.m65749i(id4, "getId(...)");
        int iComputeRelativeRotation = CameraExtKt.computeRelativeRotation(context, id4);
        Context context2 = this.this$0.getContext();
        CameraCaptureSession currentCameraSession2 = this.this$0.getCurrentCameraSession();
        AbstractC22676k.m65747g(currentCameraSession2);
        String id5 = currentCameraSession2.getDevice().getId();
        AbstractC22676k.m65749i(id5, "getId(...)");
        Integer num = (Integer) CameraExtKt.getCameraCharacteristics(context2, id5).get(CameraCharacteristics.LENS_FACING);
        if (num != null && num.intValue() == 0) {
            z4 = true;
        }
        int iComputeExifOrientation = CameraExtKt.computeExifOrientation(iComputeRelativeRotation, z4);
        InterfaceC30057d<ImageCaptureModel> interfaceC30057d = this.$cont;
        AbstractC22676k.m65747g(imageTake);
        TotalCaptureResult totalCaptureResult = this.$result;
        Integer num2 = new Integer(iComputeExifOrientation);
        ImageReader imageReader = this.this$0.getImageReader();
        AbstractC22676k.m65747g(imageReader);
        interfaceC30057d.resumeWith(new ImageCaptureModel(imageTake, totalCaptureResult, num2, imageReader.getImageFormat()));
        return c23454a0;
    }
}
