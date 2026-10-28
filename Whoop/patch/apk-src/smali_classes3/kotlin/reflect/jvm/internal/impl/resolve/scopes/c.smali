.class public final Lkotlin/reflect/jvm/internal/impl/resolve/scopes/c;
.super Lkotlin/reflect/jvm/internal/impl/resolve/scopes/e;
.source "SourceFile"


# static fields
.field public static final a:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/c;

.field public static final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/c;->a:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/c;

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->c:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/m;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->k:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v2, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->i:I

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->j:I

    or-int/2addr v0, v2

    not-int v0, v0

    and-int/2addr v0, v1

    sput v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/c;->b:I

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    sget v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/c;->b:I

    return v0
.end method
