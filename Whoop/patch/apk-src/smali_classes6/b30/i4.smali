.class public abstract Lb30/i4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/u2;

.field public static final b:Lp1/u2;

.field public static final c:Lp1/u2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb1/h;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lb1/h;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Lb30/i4;->a:Lp1/u2;

    new-instance v0, Lb1/h;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lb1/h;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Lb30/i4;->b:Lp1/u2;

    new-instance v0, Lb1/h;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lb1/h;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Lb30/i4;->c:Lp1/u2;

    return-void
.end method
