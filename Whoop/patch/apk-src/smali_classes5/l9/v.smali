.class public final Ll9/v;
.super Ll9/r;
.source "SourceFile"


# static fields
.field public static final e:Ljava/lang/Object;


# instance fields
.field public final c:Ljava/lang/Object;

.field public final d:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll9/v;->e:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lu8/o0;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Ll9/r;-><init>(Lu8/o0;)V

    iput-object p2, p0, Ll9/v;->c:Ljava/lang/Object;

    iput-object p3, p0, Ll9/v;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)I
    .locals 1

    sget-object v0, Ll9/v;->e:Ljava/lang/Object;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ll9/v;->d:Ljava/lang/Object;

    if-eqz v0, :cond_0

    move-object p1, v0

    :cond_0
    iget-object v0, p0, Ll9/r;->b:Lu8/o0;

    invoke-virtual {v0, p1}, Lu8/o0;->b(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final f(ILu8/m0;Z)Lu8/m0;
    .locals 1

    iget-object v0, p0, Ll9/r;->b:Lu8/o0;

    invoke-virtual {v0, p1, p2, p3}, Lu8/o0;->f(ILu8/m0;Z)Lu8/m0;

    iget-object p1, p2, Lu8/m0;->b:Ljava/lang/Object;

    iget-object v0, p0, Ll9/v;->d:Ljava/lang/Object;

    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    if-eqz p3, :cond_0

    sget-object p1, Ll9/v;->e:Ljava/lang/Object;

    iput-object p1, p2, Lu8/m0;->b:Ljava/lang/Object;

    :cond_0
    return-object p2
.end method

.method public final l(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll9/r;->b:Lu8/o0;

    invoke-virtual {v0, p1}, Lu8/o0;->l(I)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Ll9/v;->d:Ljava/lang/Object;

    invoke-static {p1, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Ll9/v;->e:Ljava/lang/Object;

    :cond_0
    return-object p1
.end method

.method public final m(ILu8/n0;J)Lu8/n0;
    .locals 1

    iget-object v0, p0, Ll9/r;->b:Lu8/o0;

    invoke-virtual {v0, p1, p2, p3, p4}, Lu8/o0;->m(ILu8/n0;J)Lu8/n0;

    iget-object p1, p2, Lu8/n0;->a:Ljava/lang/Object;

    iget-object p3, p0, Ll9/v;->c:Ljava/lang/Object;

    invoke-static {p1, p3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    sget-object p1, Lu8/n0;->q:Ljava/lang/Object;

    iput-object p1, p2, Lu8/n0;->a:Ljava/lang/Object;

    :cond_0
    return-object p2
.end method
