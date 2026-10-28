.class public abstract Lqc3/c0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll83/p;

.field public static final b:Lqc3/t;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lqa1/a;

    const/16 v1, 0xb

    invoke-direct {v0, v1}, Lqa1/a;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lqc3/c0;->a:Ll83/p;

    new-instance v0, Lqc3/t;

    new-instance v1, Lqc3/s;

    invoke-direct {v1}, Lqc3/s;-><init>()V

    new-instance v2, Lqc3/u;

    invoke-direct {v2}, Lqc3/u;-><init>()V

    invoke-direct {v0, v1, v2}, Lqc3/t;-><init>(Lqc3/s;Lqc3/u;)V

    sput-object v0, Lqc3/c0;->b:Lqc3/t;

    return-void
.end method
