.class public abstract Lg1/n3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll0/l1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget v0, Lg1/o3;->c:F

    const/4 v1, 0x0

    int-to-float v1, v1

    new-instance v2, Ll0/l1;

    invoke-direct {v2, v0, v1, v0, v1}, Ll0/l1;-><init>(FFFF)V

    sput-object v2, Lg1/n3;->a:Ll0/l1;

    return-void
.end method
