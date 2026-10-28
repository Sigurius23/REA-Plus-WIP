.class public final Lhf/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld93/d;
.implements Ljava/util/Map$Entry;
.implements Ld93/a;


# instance fields
.field public final E:Lkotlin/jvm/functions/Function1;

.field public final F:Lkotlin/jvm/functions/Function1;

.field public final w:Ljava/util/Map$Entry;

.field public final x:Lkotlin/jvm/internal/c;

.field public final y:Lkotlin/jvm/functions/Function1;

.field public final z:Ljava/util/Map$Entry;


# direct methods
.method public constructor <init>(Ljava/util/Map$Entry;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "src"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhf/c;->w:Ljava/util/Map$Entry;

    check-cast p2, Lkotlin/jvm/internal/c;

    iput-object p2, p0, Lhf/c;->x:Lkotlin/jvm/internal/c;

    iput-object p3, p0, Lhf/c;->y:Lkotlin/jvm/functions/Function1;

    iput-object p1, p0, Lhf/c;->z:Ljava/util/Map$Entry;

    iput-object p3, p0, Lhf/c;->E:Lkotlin/jvm/functions/Function1;

    iput-object p4, p0, Lhf/c;->F:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final getKey()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lhf/c;->w:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lhf/c;->x:Lkotlin/jvm/internal/c;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getValue()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lhf/c;->w:Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lhf/c;->y:Lkotlin/jvm/functions/Function1;

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhf/c;->F:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lhf/c;->z:Ljava/util/Map$Entry;

    invoke-interface {v0, p1}, Ljava/util/Map$Entry;->setValue(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lhf/c;->E:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
