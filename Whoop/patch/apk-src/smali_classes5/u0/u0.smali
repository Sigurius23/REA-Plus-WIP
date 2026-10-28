.class public final Lu0/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;


# instance fields
.field public final a:Lc93/a;


# direct methods
.method public constructor <init>(Lc93/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu0/u0;->a:Lc93/a;

    return-void
.end method


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 2

    invoke-static {p3, p4}, Ly3/a;->i(J)I

    move-result v0

    invoke-static {p3, p4}, Ly3/a;->h(J)I

    move-result p3

    new-instance p4, Lsg2/t;

    const/16 v1, 0x13

    invoke-direct {p4, v1, p2, p0}, Lsg2/t;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, v0, p3, p2, p4}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method
