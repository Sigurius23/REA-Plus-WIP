.class public abstract Lsi0/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/archv2/model/template/TemplatePadding;",
        "Ll0/k1;",
        "a",
        "(Lcom/whoop/archv2/model/template/TemplatePadding;)Ll0/k1;",
        "arch-v2_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lcom/whoop/archv2/model/template/TemplatePadding;)Ll0/k1;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/archv2/model/template/TemplatePadding;->getLeading()D

    move-result-wide v0

    double-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Lcom/whoop/archv2/model/template/TemplatePadding;->getTop()D

    move-result-wide v2

    double-to-float v2, v2

    mul-float/2addr v2, v1

    invoke-virtual {p0}, Lcom/whoop/archv2/model/template/TemplatePadding;->getTrailing()D

    move-result-wide v3

    double-to-float v3, v3

    mul-float/2addr v3, v1

    invoke-virtual {p0}, Lcom/whoop/archv2/model/template/TemplatePadding;->getBottom()D

    move-result-wide v4

    double-to-float p0, v4

    mul-float/2addr p0, v1

    new-instance v1, Ll0/l1;

    invoke-direct {v1, v0, v2, v3, p0}, Ll0/l1;-><init>(FFFF)V

    return-object v1
.end method
