.class public abstract Lm1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld0/v;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ld0/v;

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    const v3, 0x3dcccccd    # 0.1f

    invoke-direct {v0, v3, v3, v1, v2}, Ld0/v;-><init>(FFFF)V

    sput-object v0, Lm1/h;->a:Ld0/v;

    return-void
.end method
