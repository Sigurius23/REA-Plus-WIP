.class public final Lq93/l;
.super Ljava/lang/Object;

# interfaces
.implements Lub3/a;


# static fields
.field public static final w:Lq93/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lq93/l;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lq93/l;->w:Lq93/l;

    return-void
.end method


# virtual methods
.method public final r(Ljava/lang/Object;)Ljava/lang/Iterable;
    .locals 1

    check-cast p1, Lr93/c;

    sget-object v0, Lq93/p;->h:[Lj93/z;

    invoke-interface {p1}, Lr93/c;->a()Lr93/c;

    move-result-object p1

    invoke-interface {p1}, Lr93/c;->h()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    return-object p1
.end method
