.class public abstract Lqc3/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll83/p;

.field public static final b:Lqc3/u;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lqa1/a;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lqa1/a;-><init>(I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lqc3/f0;->a:Ll83/p;

    new-instance v0, Lqc3/u;

    invoke-direct {v0}, Lqc3/u;-><init>()V

    sput-object v0, Lqc3/f0;->b:Lqc3/u;

    return-void
.end method
