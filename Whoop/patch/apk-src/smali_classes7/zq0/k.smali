.class public final synthetic Lzq0/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lzq0/p;


# direct methods
.method public synthetic constructor <init>(ILzq0/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lzq0/k;->w:I

    iput-object p2, p0, Lzq0/k;->x:Lzq0/p;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lzq0/k;->x:Lzq0/p;

    check-cast p1, Ld0/e;

    iget v1, p0, Lzq0/k;->w:I

    invoke-static {v1, v0, p1}, Lzq0/f$e;->f(ILzq0/p;Ld0/e;)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
