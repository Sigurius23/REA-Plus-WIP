.class public final La3/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/s0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:La3/w0;


# direct methods
.method public constructor <init>(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La3/w0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La3/v0;->a:I

    iput p2, p0, La3/v0;->b:I

    iput-object p3, p0, La3/v0;->c:Ljava/util/Map;

    iput-object p4, p0, La3/v0;->d:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, La3/v0;->e:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, La3/v0;->f:La3/w0;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, La3/v0;->c:Ljava/util/Map;

    return-object v0
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, La3/v0;->f:La3/w0;

    iget-object v0, v0, La3/w0;->L:Ly2/o0;

    iget-object v1, p0, La3/v0;->e:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final c()Lkotlin/jvm/functions/Function1;
    .locals 1

    iget-object v0, p0, La3/v0;->d:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getHeight()I
    .locals 1

    iget v0, p0, La3/v0;->b:I

    return v0
.end method

.method public final getWidth()I
    .locals 1

    iget v0, p0, La3/v0;->a:I

    return v0
.end method
