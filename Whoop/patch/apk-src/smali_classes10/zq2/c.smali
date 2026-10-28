.class public final synthetic Lzq2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:Lkotlin/jvm/functions/Function1;

.field public final synthetic x:Lzq2/a;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lzq2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzq2/c;->w:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lzq2/c;->x:Lzq2/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lzq2/c;->w:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lzq2/c;->x:Lzq2/a;

    invoke-static {v0, v1}, Lzq2/d;->b(Lkotlin/jvm/functions/Function1;Lzq2/a;)Ll83/a0;

    move-result-object v0

    return-object v0
.end method
