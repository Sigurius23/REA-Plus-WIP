.class public interface abstract Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;


# static fields
.field public static final a:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/m;->a:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/m;

    sput-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->a:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/m;

    return-void
.end method


# virtual methods
.method public abstract getClassifierNames()Ljava/util/Set;
.end method

.method public abstract getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;
.end method

.method public abstract getFunctionNames()Ljava/util/Set;
.end method

.method public abstract getVariableNames()Ljava/util/Set;
.end method
