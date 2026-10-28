.class public final Lea3/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lca3/f;


# static fields
.field public static final b:Lca3/d;


# instance fields
.field public final a:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lca3/d;

    const-class v1, Lea3/e;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-direct {v0, v1}, Lca3/d;-><init>(Lj93/d;)V

    sput-object v0, Lea3/e;->b:Lca3/d;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lea3/e;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final getType()Lca3/d;
    .locals 1

    sget-object v0, Lea3/e;->b:Lca3/d;

    return-object v0
.end method
