.class public final Lea3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lca3/e;


# static fields
.field public static final a:Lca3/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lca3/d;

    const-class v1, Lea3/c;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-direct {v0, v1}, Lca3/d;-><init>(Lj93/d;)V

    sput-object v0, Lea3/c;->a:Lca3/d;

    return-void
.end method


# virtual methods
.method public final getType()Lca3/d;
    .locals 1

    sget-object v0, Lea3/c;->a:Lca3/d;

    return-object v0
.end method
