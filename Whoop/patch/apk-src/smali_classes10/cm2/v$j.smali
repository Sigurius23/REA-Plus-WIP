.class public final Lcm2/v$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcm2/v;->v(Lvl2/w$c;)Lcm2/a0$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Z

.field final synthetic x:Lor2/h0;

.field final synthetic y:Lvl2/w$c;


# direct methods
.method public constructor <init>(ZLor2/h0;Lvl2/w$c;)V
    .locals 0

    iput-boolean p1, p0, Lcm2/v$j;->w:Z

    iput-object p2, p0, Lcm2/v$j;->x:Lor2/h0;

    iput-object p3, p0, Lcm2/v$j;->y:Lvl2/w$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lm91/u;)Lm91/u;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lj71/c;

    iget-boolean v0, p0, Lcm2/v$j;->w:Z

    iget-object v1, p0, Lcm2/v$j;->x:Lor2/h0;

    iget-object v2, p0, Lcm2/v$j;->y:Lvl2/w$c;

    invoke-virtual {v2}, Lvl2/w$c;->f()Lvl2/a;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, Lcm2/e;->a(Lj71/c;ZLor2/h0;Lvl2/a;)Lj71/c;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lm91/u;

    invoke-virtual {p0, p1}, Lcm2/v$j;->a(Lm91/u;)Lm91/u;

    move-result-object p1

    return-object p1
.end method
