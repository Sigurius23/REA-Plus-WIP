.class public abstract Lme/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/LinkedHashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Li93/c;

    const/16 v1, 0x5a

    const/16 v2, 0x41

    invoke-direct {v0, v2, v1}, Li93/a;-><init>(CC)V

    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    new-instance v1, Li93/c;

    const/16 v3, 0x61

    const/16 v4, 0x7a

    invoke-direct {v1, v3, v4}, Li93/a;-><init>(CC)V

    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v0

    new-instance v1, Li93/c;

    const/16 v3, 0x30

    const/16 v4, 0x39

    invoke-direct {v1, v3, v4}, Li93/a;-><init>(CC)V

    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v0, v3}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v0

    const-string v3, "-._~"

    invoke-static {v3}, Lj93/l0;->n(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v0, v3}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v0

    new-instance v3, Li93/c;

    const/16 v4, 0x46

    invoke-direct {v3, v2, v4}, Li93/a;-><init>(CC)V

    invoke-static {v3}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v1

    const/16 v2, 0x25

    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    invoke-static {v2, v1}, Ldt/b;->D(Ljava/lang/Object;Ljava/util/Set;)Ljava/util/LinkedHashSet;

    move-result-object v1

    const-string v2, "!$&\'()*+,;="

    invoke-static {v2}, Lj93/l0;->n(Ljava/lang/String;)Ljava/util/Set;

    move-result-object v2

    invoke-static {v0, v1}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v0

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v0, v2}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v0

    sput-object v0, Lme/i;->a:Ljava/util/LinkedHashSet;

    return-void
.end method
