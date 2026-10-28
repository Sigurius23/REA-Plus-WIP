.class public final synthetic Lxq2/e1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lkotlin/jvm/functions/Function1;

.field public final synthetic x:I

.field public final synthetic y:Lmq2/b;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;ILmq2/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxq2/e1;->w:Lkotlin/jvm/functions/Function1;

    iput p2, p0, Lxq2/e1;->x:I

    iput-object p3, p0, Lxq2/e1;->y:Lmq2/b;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lxq2/e1;->x:I

    iget-object v1, p0, Lxq2/e1;->y:Lmq2/b;

    iget-object v2, p0, Lxq2/e1;->w:Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v1}, Lxq2/c1$c;->f(Lkotlin/jvm/functions/Function1;ILmq2/b;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
