.class public abstract Lch/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/u2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcb1/a;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lcb1/a;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Lch/q;->a:Lp1/u2;

    return-void
.end method
