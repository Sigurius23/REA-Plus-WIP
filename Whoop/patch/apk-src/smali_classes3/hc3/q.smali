.class public final Lhc3/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlinx/coroutines/internal/MainDispatcherFactory;


# static fields
.field public static final a:Lhc3/q;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lhc3/q;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lhc3/q;->a:Lhc3/q;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/List;)Lbc3/w1;
    .locals 0

    new-instance p1, Lhc3/p;

    invoke-direct {p1}, Lbc3/z;-><init>()V

    return-object p1
.end method

.method public final b()I
    .locals 1

    const/4 v0, -0x1

    return v0
.end method
