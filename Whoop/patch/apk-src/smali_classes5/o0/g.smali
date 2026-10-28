.class public final Lo0/g;
.super Lp0/y;
.source "SourceFile"

# interfaces
.implements Lo0/s;


# static fields
.field public static final e:Lm22/b;


# instance fields
.field public final c:Lo0/v;

.field public final d:Lab/h0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm22/b;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lm22/b;-><init>(I)V

    sput-object v0, Lo0/g;->e:Lm22/b;

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lo0/v;

    invoke-direct {v0, p0}, Lo0/v;-><init>(Lo0/g;)V

    iput-object v0, p0, Lo0/g;->c:Lo0/v;

    new-instance v0, Lab/h0;

    const/16 v1, 0xc

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lab/h0;-><init>(IB)V

    iput-object v0, p0, Lo0/g;->d:Lab/h0;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final m()Lab/h0;
    .locals 1

    iget-object v0, p0, Lo0/g;->d:Lab/h0;

    return-object v0
.end method

.method public final q(ILkotlin/jvm/functions/Function1;Lx1/b;)V
    .locals 2

    new-instance v0, Lo0/f;

    sget-object v1, Lo0/g;->e:Lm22/b;

    invoke-direct {v0, v1, p2, p3}, Lo0/f;-><init>(Lc93/m;Lkotlin/jvm/functions/Function1;Lx1/b;)V

    iget-object p2, p0, Lo0/g;->d:Lab/h0;

    invoke-virtual {p2, p1, v0}, Lab/h0;->g(ILp0/q;)V

    return-void
.end method
