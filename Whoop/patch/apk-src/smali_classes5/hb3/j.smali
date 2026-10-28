.class public final Lhb3/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhb3/p;
.implements Lhb3/n;
.implements Lhb3/o;


# static fields
.field public static final b:Lhb3/j;

.field public static final c:Lhb3/j;

.field public static final d:Lhb3/j;

.field public static final e:Lhb3/j;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lhb3/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lhb3/j;->b:Lhb3/j;

    new-instance v0, Lhb3/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lhb3/j;->c:Lhb3/j;

    new-instance v0, Lhb3/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lhb3/j;->d:Lhb3/j;

    new-instance v0, Lhb3/j;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lhb3/j;->e:Lhb3/j;

    return-void
.end method

.method public static e(Lqa3/e0;)Lr93/a0;
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, -0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lhb3/b0;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    :goto_0
    const/4 v0, 0x1

    if-eq p0, v0, :cond_4

    const/4 v0, 0x2

    if-eq p0, v0, :cond_3

    const/4 v0, 0x3

    if-eq p0, v0, :cond_2

    const/4 v0, 0x4

    if-eq p0, v0, :cond_1

    sget-object p0, Lr93/a0;->x:Lr93/a0;

    return-object p0

    :cond_1
    sget-object p0, Lr93/a0;->y:Lr93/a0;

    return-object p0

    :cond_2
    sget-object p0, Lr93/a0;->E:Lr93/a0;

    return-object p0

    :cond_3
    sget-object p0, Lr93/a0;->z:Lr93/a0;

    return-object p0

    :cond_4
    sget-object p0, Lr93/a0;->x:Lr93/a0;

    return-object p0
.end method


# virtual methods
.method public a(Lr93/c;)V
    .locals 3

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    const/4 v1, 0x1

    const-string v2, "descriptor"

    aput-object v2, p1, v0

    const-string v0, "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1"

    aput-object v0, p1, v1

    const/4 v0, 0x2

    const-string v1, "reportCannotInferVisibility"

    aput-object v1, p1, v0

    const-string v0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    invoke-static {v0, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public b(Lr93/e;Ljava/util/ArrayList;)V
    .locals 0

    return-void
.end method

.method public c(Lqa3/w0;Ljava/lang/String;Llb3/c0;Llb3/c0;)Llb3/y;
    .locals 1

    const-string v0, "proto"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "flexibleId"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "lowerBound"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "upperBound"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "This method should not be used."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d()Ljava/lang/Boolean;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0
.end method
