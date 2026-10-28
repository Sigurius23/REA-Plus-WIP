.class public final Lq93/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt93/c;


# static fields
.field public static final d:Lq93/e;

.field public static final synthetic e:[Lj93/z;

.field public static final f:Lva3/e;

.field public static final g:Lva3/h;

.field public static final h:Lva3/c;


# instance fields
.field public final a:Lu93/e0;

.field public final b:Lkotlin/jvm/functions/Function1;

.field public final c:Lkb3/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/x;

    const-class v1, Lq93/g;

    const-string v2, "cloneable"

    const-string v3, "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->property1(Lkotlin/jvm/internal/w;)Lj93/w;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lq93/g;->e:[Lj93/z;

    new-instance v0, Lq93/e;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lq93/g;->d:Lq93/e;

    sget-object v0, Lo93/n;->k:Lva3/e;

    sput-object v0, Lq93/g;->f:Lva3/e;

    sget-object v0, Lo93/m;->c:Lva3/f;

    invoke-virtual {v0}, Lva3/f;->g()Lva3/h;

    move-result-object v1

    sput-object v1, Lq93/g;->g:Lva3/h;

    invoke-virtual {v0}, Lva3/f;->i()Lva3/e;

    move-result-object v0

    new-instance v1, Lva3/c;

    invoke-virtual {v0}, Lva3/e;->b()Lva3/e;

    move-result-object v2

    iget-object v0, v0, Lva3/e;->a:Lva3/f;

    invoke-virtual {v0}, Lva3/f;->g()Lva3/h;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    sput-object v1, Lq93/g;->h:Lva3/c;

    return-void
.end method

.method public constructor <init>(Lkb3/k;Lu93/e0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lq93/g;->a:Lu93/e0;

    sget-object p2, Lq93/f;->w:Lq93/f;

    iput-object p2, p0, Lq93/g;->b:Lkotlin/jvm/functions/Function1;

    new-instance p2, Lce3/p;

    const/4 v0, 0x5

    const/4 v1, 0x0

    invoke-direct {p2, p0, p1, v1, v0}, Lce3/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    new-instance v0, Lkb3/i;

    invoke-direct {v0, p1, p2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object v0, p0, Lq93/g;->c:Lkb3/i;

    return-void
.end method


# virtual methods
.method public final a(Lva3/e;)Ljava/util/Collection;
    .locals 1

    const-string v0, "packageFqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lq93/g;->f:Lva3/e;

    invoke-virtual {p1, v0}, Lva3/e;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lq93/g;->e:[Lj93/z;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    iget-object v0, p0, Lq93/g;->c:Lkb3/i;

    invoke-static {v0, p1}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu93/l;

    invoke-static {p1}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_0
    sget-object p1, Lm83/a0;->w:Lm83/a0;

    return-object p1
.end method

.method public final b(Lva3/e;Lva3/h;)Z
    .locals 1

    const-string v0, "packageFqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lq93/g;->g:Lva3/h;

    invoke-virtual {p2, v0}, Lva3/h;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p2, Lq93/g;->f:Lva3/e;

    invoke-virtual {p1, p2}, Lva3/e;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final c(Lva3/c;)Lr93/e;
    .locals 1

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lq93/g;->h:Lva3/c;

    invoke-virtual {p1, v0}, Lva3/c;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lq93/g;->e:[Lj93/z;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    iget-object v0, p0, Lq93/g;->c:Lkb3/i;

    invoke-static {v0, p1}, Lpf/c;->C(Lkb3/l;Lj93/z;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu93/l;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
