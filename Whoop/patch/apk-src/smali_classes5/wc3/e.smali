.class public final Lwc3/e;
.super Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;
.source "SourceFile"


# instance fields
.field public final a:Lj93/d;

.field public final b:Ljava/util/List;

.field public final c:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lj93/d;)V
    .locals 2

    const-string v0, "baseClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;-><init>()V

    iput-object p1, p0, Lwc3/e;->a:Lj93/d;

    .line 2
    sget-object p1, Lm83/y;->w:Lm83/y;

    iput-object p1, p0, Lwc3/e;->b:Ljava/util/List;

    .line 3
    sget-object p1, Ll83/i;->x:Ll83/i;

    new-instance v0, Lm83/p;

    const/16 v1, 0x18

    invoke-direct {v0, p0, v1}, Lm83/p;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lwc3/e;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V
    .locals 1

    const-string v0, "baseClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0, p1}, Lwc3/e;-><init>(Lj93/d;)V

    .line 5
    invoke-static {p2}, Lm83/n;->W([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lwc3/e;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final getBaseClass()Lj93/d;
    .locals 1

    iget-object v0, p0, Lwc3/e;->a:Lj93/d;

    return-object v0
.end method

.method public final getDescriptor()Lyc3/g;
    .locals 1

    iget-object v0, p0, Lwc3/e;->c:Ljava/lang/Object;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyc3/g;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "kotlinx.serialization.PolymorphicSerializer(baseClass: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lwc3/e;->a:Lj93/d;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
