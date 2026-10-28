.class public final Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;
.super Lkotlin/reflect/jvm/internal/impl/resolve/scopes/p;
.source "SourceFile"


# static fields
.field public static final b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;

    return-void
.end method


# virtual methods
.method public final getClassifierNames()Ljava/util/Set;
    .locals 1

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    return-object v0
.end method

.method public final getFunctionNames()Ljava/util/Set;
    .locals 1

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    return-object v0
.end method

.method public final getVariableNames()Ljava/util/Set;
    .locals 1

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    return-object v0
.end method
