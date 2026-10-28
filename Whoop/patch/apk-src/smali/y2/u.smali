.class public final Ly2/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/s0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/util/Map;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ly2/u;->a:I

    iput p2, p0, Ly2/u;->b:I

    iput-object p3, p0, Ly2/u;->c:Ljava/util/Map;

    iput-object p4, p0, Ly2/u;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Ly2/u;->c:Ljava/util/Map;

    return-object v0
.end method

.method public final b()V
    .locals 0

    return-void
.end method

.method public final c()Lkotlin/jvm/functions/Function1;
    .locals 1

    iget-object v0, p0, Ly2/u;->d:Lkotlin/jvm/functions/Function1;

    return-object v0
.end method

.method public final getHeight()I
    .locals 1

    iget v0, p0, Ly2/u;->b:I

    return v0
.end method

.method public final getWidth()I
    .locals 1

    iget v0, p0, Ly2/u;->a:I

    return v0
.end method
