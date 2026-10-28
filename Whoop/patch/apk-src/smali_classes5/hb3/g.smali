.class public final Lhb3/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ljava/util/Set;


# instance fields
.field public final a:Lhb3/i;

.field public final b:Landroidx/lifecycle/h2;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Lo93/m;->c:Lva3/f;

    invoke-virtual {v0}, Lva3/f;->i()Lva3/e;

    move-result-object v0

    new-instance v1, Lva3/c;

    invoke-virtual {v0}, Lva3/e;->b()Lva3/e;

    move-result-object v2

    iget-object v0, v0, Lva3/e;->a:Lva3/f;

    invoke-virtual {v0}, Lva3/f;->g()Lva3/h;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lva3/c;-><init>(Lva3/e;Lva3/h;)V

    invoke-static {v1}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    sput-object v0, Lhb3/g;->c:Ljava/util/Set;

    return-void
.end method

.method public constructor <init>(Lhb3/i;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhb3/g;->a:Lhb3/i;

    iget-object p1, p1, Lhb3/i;->a:Lkb3/k;

    new-instance v0, Ldc3/s;

    const/4 v1, 0x4

    invoke-direct {v0, p0, v1}, Ldc3/s;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lkb3/k;->c(Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/h2;

    move-result-object p1

    iput-object p1, p0, Lhb3/g;->b:Landroidx/lifecycle/h2;

    return-void
.end method


# virtual methods
.method public final a(Lva3/c;Lhb3/d;)Lr93/e;
    .locals 1

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lhb3/f;

    invoke-direct {v0, p1, p2}, Lhb3/f;-><init>(Lva3/c;Lhb3/d;)V

    iget-object p1, p0, Lhb3/g;->b:Landroidx/lifecycle/h2;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/h2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr93/e;

    return-object p1
.end method
