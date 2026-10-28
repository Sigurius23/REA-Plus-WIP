.class public final Lq0/n;
.super Lp0/y;
.source "SourceFile"


# instance fields
.field public final c:Lc93/n;

.field public final d:Lkotlin/jvm/functions/Function1;

.field public final e:Lab/h0;


# direct methods
.method public constructor <init>(Lc93/n;Lkotlin/jvm/functions/Function1;I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq0/n;->c:Lc93/n;

    iput-object p2, p0, Lq0/n;->d:Lkotlin/jvm/functions/Function1;

    new-instance v0, Lab/h0;

    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lab/h0;-><init>(IB)V

    new-instance v1, Lq0/h;

    invoke-direct {v1, p2, p1}, Lq0/h;-><init>(Lkotlin/jvm/functions/Function1;Lc93/n;)V

    invoke-virtual {v0, p3, v1}, Lab/h0;->g(ILp0/q;)V

    iput-object v0, p0, Lq0/n;->e:Lab/h0;

    return-void
.end method


# virtual methods
.method public final m()Lab/h0;
    .locals 1

    iget-object v0, p0, Lq0/n;->e:Lab/h0;

    return-object v0
.end method
