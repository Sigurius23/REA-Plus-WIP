.class public abstract Lp6/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lou1/a;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lou1/a;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Lp6/q;->a:Lp1/b0;

    return-void
.end method
