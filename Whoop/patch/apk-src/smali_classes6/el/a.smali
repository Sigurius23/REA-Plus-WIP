.class public final Lel/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldl/t;


# static fields
.field public static final b:Lwk/g;


# instance fields
.field public final a:Lad3/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x9c4

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout"

    invoke-static {v0, v1}, Lwk/g;->a(Ljava/lang/Object;Ljava/lang/String;)Lwk/g;

    move-result-object v0

    sput-object v0, Lel/a;->b:Lwk/g;

    return-void
.end method

.method public constructor <init>(Lad3/z;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lel/a;->a:Lad3/z;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Z
    .locals 0

    check-cast p1, Ldl/i;

    const/4 p1, 0x1

    return p1
.end method

.method public final b(Ljava/lang/Object;IILwk/h;)Ldl/s;
    .locals 1

    check-cast p1, Ldl/i;

    iget-object p2, p0, Lel/a;->a:Lad3/z;

    if-eqz p2, :cond_1

    iget-object p2, p2, Lad3/z;->x:Ljava/lang/Object;

    check-cast p2, Ldl/q;

    invoke-static {p1}, Ldl/r;->a(Ljava/lang/Object;)Ldl/r;

    move-result-object p3

    invoke-virtual {p2, p3}, Ltl/h;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p3}, Ldl/r;->b()V

    check-cast v0, Ldl/i;

    if-nez v0, :cond_0

    invoke-static {p1}, Ldl/r;->a(Ljava/lang/Object;)Ldl/r;

    move-result-object p3

    invoke-virtual {p2, p3, p1}, Ltl/h;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :cond_1
    :goto_0
    sget-object p2, Lel/a;->b:Lwk/g;

    invoke-virtual {p4, p2}, Lwk/h;->c(Lwk/g;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result p2

    new-instance p3, Ldl/s;

    new-instance p4, Lxk/k;

    invoke-direct {p4, p1, p2}, Lxk/k;-><init>(Ldl/i;I)V

    invoke-direct {p3, p1, p4}, Ldl/s;-><init>(Lwk/e;Lxk/e;)V

    return-object p3
.end method
