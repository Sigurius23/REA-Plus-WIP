.class public final Lea3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lca3/i;


# static fields
.field public static final b:Lca3/d;


# instance fields
.field public final a:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lca3/d;

    const-class v1, Lea3/h;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-direct {v0, v1}, Lca3/d;-><init>(Lj93/d;)V

    sput-object v0, Lea3/h;->b:Lca3/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lea3/h;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lea3/h;->a:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getType()Lca3/d;
    .locals 1

    sget-object v0, Lea3/h;->b:Lca3/d;

    return-object v0
.end method
