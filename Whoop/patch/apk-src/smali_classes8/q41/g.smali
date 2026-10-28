.class public final synthetic Lq41/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lq41/c;

.field public final synthetic x:Lkotlin/jvm/functions/Function1;

.field public final synthetic y:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lq41/c;Lkotlin/jvm/functions/Function1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq41/g;->w:Lq41/c;

    iput-object p2, p0, Lq41/g;->x:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lq41/g;->y:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lq41/g;->x:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lq41/g;->y:Lp1/c1;

    iget-object v2, p0, Lq41/g;->w:Lq41/c;

    invoke-static {v2, v0, v1}, Lq41/f$b;->a(Lq41/c;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
