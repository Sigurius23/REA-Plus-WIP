.class public abstract Lh0/u;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/b0;

.field public static final b:Lh0/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgo1/a;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Lgo1/a;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lkotlin/jvm/functions/Function1;)V

    sput-object v1, Lh0/u;->a:Lp1/b0;

    new-instance v0, Lh0/t;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lh0/u;->b:Lh0/t;

    return-void
.end method

.method public static final a()Lp1/b0;
    .locals 1

    sget-object v0, Lh0/u;->a:Lp1/b0;

    return-object v0
.end method
