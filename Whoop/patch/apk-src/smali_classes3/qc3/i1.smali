.class public abstract Lqc3/i1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lsc3/m;

.field public static final b:Lsc3/u;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lsc3/m;

    new-instance v1, Lsc3/r;

    sget-object v2, Lqc3/h1;->w:Lqc3/h1;

    invoke-direct {v1, v2}, Lsc3/r;-><init>(Lkotlin/jvm/internal/q;)V

    const/16 v2, 0xe

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lsc3/m;-><init>(Lsc3/r;Lrc3/a;I)V

    sput-object v0, Lqc3/i1;->a:Lsc3/m;

    new-instance v0, Lsc3/u;

    new-instance v1, Lsc3/r;

    sget-object v2, Lqc3/g1;->w:Lqc3/g1;

    invoke-direct {v1, v2}, Lsc3/r;-><init>(Lkotlin/jvm/internal/q;)V

    const/16 v2, 0xc

    const/16 v4, 0x38

    invoke-direct {v0, v1, v2, v3, v4}, Lsc3/u;-><init>(Lsc3/r;ILqc3/l0;I)V

    sput-object v0, Lqc3/i1;->b:Lsc3/u;

    return-void
.end method
