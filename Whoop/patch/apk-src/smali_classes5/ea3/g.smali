.class public final Lea3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lca3/h;


# static fields
.field public static final c:Lca3/d;


# instance fields
.field public a:Z

.field public final b:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lca3/d;

    const-class v1, Lea3/g;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-direct {v0, v1}, Lca3/d;-><init>(Lj93/d;)V

    sput-object v0, Lea3/g;->c:Lca3/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lea3/g;->b:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_2

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const-class v1, Lea3/g;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    const-string v0, "null cannot be cast to non-null type kotlin.metadata.jvm.internal.JvmTypeExtension"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lea3/g;

    iget-boolean v0, p0, Lea3/g;->a:Z

    iget-boolean v1, p1, Lea3/g;->a:Z

    if-eq v0, v1, :cond_3

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lea3/g;->b:Ljava/util/ArrayList;

    iget-object p1, p1, Lea3/g;->b:Ljava/util/ArrayList;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    :goto_1
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_2
    const/4 p1, 0x1

    return p1
.end method

.method public final getType()Lca3/d;
    .locals 1

    sget-object v0, Lea3/g;->c:Lca3/d;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget-boolean v0, p0, Lea3/g;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lea3/g;->b:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
