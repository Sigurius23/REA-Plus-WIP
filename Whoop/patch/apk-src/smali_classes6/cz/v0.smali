.class public final Lcz/v0;
.super Ls83/c;
.source "SourceFile"


# instance fields
.field public w:Lcz/w0;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lcz/w0;

.field public z:I


# direct methods
.method public constructor <init>(Lcz/w0;Ls83/c;)V
    .locals 0

    iput-object p1, p0, Lcz/v0;->y:Lcz/w0;

    invoke-direct {p0, p2}, Ls83/c;-><init>(Lq83/d;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lcz/v0;->x:Ljava/lang/Object;

    iget p1, p0, Lcz/v0;->z:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lcz/v0;->z:I

    iget-object p1, p0, Lcz/v0;->y:Lcz/w0;

    invoke-virtual {p1, p0}, Lcz/w0;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Ll83/n;

    invoke-direct {v0, p1}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
