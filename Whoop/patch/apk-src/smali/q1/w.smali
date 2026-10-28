.class public final Lq1/w;
.super Lq1/j0;
.source "SourceFile"


# static fields
.field public static final d:Lq1/w;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lq1/w;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lq1/j0;-><init>(III)V

    sput-object v0, Lq1/w;->d:Lq1/w;

    return-void
.end method


# virtual methods
.method public final d(Lb83/i;Lp1/c;Lp1/i2;Lx1/h;Lq1/k0;)V
    .locals 0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lb83/i;->c(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp1/a2;

    iget-object p2, p4, Lx1/h;->e:Lr1/c;

    invoke-virtual {p2, p1}, Lr1/c;->b(Ljava/lang/Object;)V

    iget-object p2, p4, Lx1/h;->d:La0/w0;

    invoke-virtual {p2, p1}, La0/w0;->a(Ljava/lang/Object;)Z

    return-void
.end method
