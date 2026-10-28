.class public abstract Lg1/m5;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/u2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfw0/a;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lfw0/a;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Lg1/m5;->a:Lp1/u2;

    return-void
.end method

.method public static final a()Lp1/u2;
    .locals 1

    sget-object v0, Lg1/m5;->a:Lp1/u2;

    return-object v0
.end method
