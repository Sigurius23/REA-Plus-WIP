.class public abstract Ljw/g;
.super Ljw/a;
.source "SourceFile"


# static fields
.field public static final f:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ljw/b;->a:Ljava/util/Set;

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    sget-object v1, Lgw/i;->y:Lgw/i;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v1, Lgw/i;->z:Lgw/i;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v1, Lgw/i;->E:Lgw/i;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v1, Lgw/i;->F:Lgw/i;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    sget-object v1, Lgw/i;->G:Lgw/i;

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Ljw/g;->f:Ljava/util/Set;

    return-void
.end method
