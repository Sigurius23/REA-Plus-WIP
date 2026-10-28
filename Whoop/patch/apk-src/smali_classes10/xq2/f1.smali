.class public final synthetic Lxq2/f1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lkotlin/jvm/functions/Function1;

.field public final synthetic x:I


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxq2/f1;->w:Lkotlin/jvm/functions/Function1;

    iput p2, p0, Lxq2/f1;->x:I

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lxq2/f1;->w:Lkotlin/jvm/functions/Function1;

    iget v1, p0, Lxq2/f1;->x:I

    invoke-static {v1, v0}, Lxq2/c1$d$a;->f(ILkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
