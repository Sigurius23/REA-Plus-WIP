.class public abstract Lb3/n3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb3/m3;


# static fields
.field public static final a:Lp1/k1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lu2/z;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lu2/z;-><init>(I)V

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    sput-object v0, Lb3/n3;->a:Lp1/k1;

    return-void
.end method
