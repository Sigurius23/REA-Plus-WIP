.class public abstract Lmj/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/u2;

.field public static final b:Lp1/u2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lmj/q;->x:Lmj/q;

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Lmj/r;->a:Lp1/u2;

    sget-object v0, Lmj/q;->y:Lmj/q;

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Lmj/r;->b:Lp1/u2;

    return-void
.end method
