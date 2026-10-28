package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whoop.android.R;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import p507tx.AbstractC34235f;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, m65681d2 = {"Lcom/stripe/android/stripe3ds2/views/BrandZoneView;", "Landroid/widget/LinearLayout;", "Landroid/widget/ImageView;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Landroid/widget/ImageView;", "getIssuerImageView$3ds2sdk_release", "()Landroid/widget/ImageView;", "issuerImageView", "x", "getPaymentSystemImageView$3ds2sdk_release", "paymentSystemImageView", "3ds2sdk_release"}, m65682k = 1, m65683mv = {2, 1, 0}, m65685xi = 48)
public final class BrandZoneView extends LinearLayout {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public final ImageView issuerImageView;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    public final ImageView paymentSystemImageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandZoneView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC22676k.m65750j(context, "context");
        LayoutInflater.from(context).inflate(R.layout.stripe_brand_zone_view, this);
        int i13 = R.id.issuer_image;
        ImageView imageView = (ImageView) AbstractC34235f.m108203J(this, R.id.issuer_image);
        if (imageView != null) {
            i13 = R.id.payment_system_image;
            ImageView imageView2 = (ImageView) AbstractC34235f.m108203J(this, R.id.payment_system_image);
            if (imageView2 != null) {
                this.issuerImageView = imageView;
                this.paymentSystemImageView = imageView2;
                return;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(getResources().getResourceName(i13)));
    }

    /* JADX INFO: renamed from: getIssuerImageView$3ds2sdk_release, reason: from getter */
    public final ImageView getIssuerImageView() {
        return this.issuerImageView;
    }

    /* JADX INFO: renamed from: getPaymentSystemImageView$3ds2sdk_release, reason: from getter */
    public final ImageView getPaymentSystemImageView() {
        return this.paymentSystemImageView;
    }
}
