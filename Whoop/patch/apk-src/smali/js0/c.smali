.class public abstract Ljs0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J*\u0010\u0007\u001a\u00028\u0000\"\n\u0008\u0000\u0010\u0004\u0018\u0001*\u00020\u00012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\u0008\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J*\u0010\t\u001a\u00028\u0000\"\n\u0008\u0000\u0010\u0004\u0018\u0001*\u00020\u00012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005H\u0086\n\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u000f\u0010\u000b\u001a\u00020\nH&\u00a2\u0006\u0004\u0008\u000b\u0010\u0003J\u0010\u0010\r\u001a\u00020\u000cH\u00a6@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\'\u0010\u000f\u001a\u00028\u0000\"\u0008\u0008\u0000\u0010\u0004*\u00020\u00012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0005H&\u00a2\u0006\u0004\u0008\u000f\u0010\u0008R\u0017\u0010\u0011\u001a\u00020\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Ljs0/c;",
        "",
        "<init>",
        "()V",
        "T",
        "Ljs0/a;",
        "configuration",
        "getConfigurationValue",
        "(Ljs0/a;)Ljava/lang/Object;",
        "get",
        "Ll83/a0;",
        "fetchConfigurationValuesAsync",
        "",
        "fetchConfigurationValues",
        "(Lq83/d;)Ljava/lang/Object;",
        "getConfigurationValueFromJava",
        "Ljs0/b;",
        "configurations",
        "Ljs0/b;",
        "getConfigurations",
        "()Ljs0/b;",
        "config-service_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final configurations:Ljs0/b;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljs0/b;

    invoke-direct {v0}, Ljs0/b;-><init>()V

    iput-object v0, p0, Ljs0/c;->configurations:Ljs0/b;

    return-void
.end method


# virtual methods
.method public abstract fetchConfigurationValues(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract fetchConfigurationValuesAsync()V
.end method

.method public final get(Ljs0/a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljs0/a<",
            "TT;>;)TT;"
        }
    .end annotation

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljs0/c;->getConfigurations()Ljs0/b;

    invoke-virtual {p1}, Ljs0/a;->getName()Ljava/lang/String;

    invoke-virtual {p1}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final getConfigurationValue(Ljs0/a;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljs0/a<",
            "TT;>;)TT;"
        }
    .end annotation

    const-string v0, "configuration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljs0/c;->getConfigurations()Ljs0/b;

    invoke-virtual {p1}, Ljs0/a;->getName()Ljava/lang/String;

    invoke-virtual {p1}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    const/4 p1, 0x0

    throw p1
.end method

.method public abstract getConfigurationValueFromJava(Ljs0/a;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljs0/a<",
            "TT;>;)TT;"
        }
    .end annotation
.end method

.method public final getConfigurations()Ljs0/b;
    .locals 1

    iget-object v0, p0, Ljs0/c;->configurations:Ljs0/b;

    return-object v0
.end method
