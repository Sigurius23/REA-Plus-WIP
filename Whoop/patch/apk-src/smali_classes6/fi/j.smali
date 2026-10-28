.class public abstract Lfi/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lf93/a;

.field public static final b:Lf93/a;

.field public static final c:Lf93/a;

.field public static final d:Lf93/a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lf93/a;

    sget-object v1, Lm83/y;->w:Lm83/y;

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lfi/j;->a:Lf93/a;

    new-instance v0, Lf93/a;

    new-instance v1, Lgi/i;

    new-instance v2, Lgi/a;

    const/16 v3, 0x1000

    invoke-direct {v2, v3}, Lgi/a;-><init>(I)V

    new-instance v4, Lgi/a;

    invoke-direct {v4, v3}, Lgi/a;-><init>(I)V

    invoke-direct {v1, v2, v4}, Lgi/i;-><init>(Lgi/c;Lgi/c;)V

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lfi/j;->b:Lf93/a;

    new-instance v0, Lf93/a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v0, v1, v2}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lfi/j;->c:Lf93/a;

    new-instance v0, Lf93/a;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {v0, v1, v2}, Lf93/a;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lfi/j;->d:Lf93/a;

    return-void
.end method

.method public static final varargs a(Lfi/e;[Lii/b;)V
    .locals 7

    invoke-static {p1}, Lm83/n;->W0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0}, Lfi/e;->b()Lrh/h;

    move-result-object v0

    sget-object v1, Lfi/j;->a:Lf93/a;

    invoke-static {p1}, Lx43/j;->V(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lrh/h;->a(Lf93/a;Ljava/lang/Object;)V

    new-instance v0, Lkotlin/jvm/internal/e0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object v1, p1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v5, Leg/j;

    const/16 p1, 0xb

    invoke-direct {v5, v0, p1}, Leg/j;-><init>(Ljava/lang/Object;I)V

    const/16 v6, 0x1f

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "coil#transformations"

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lfi/e;->c()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, v0, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    invoke-virtual {p0}, Lfi/e;->c()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
