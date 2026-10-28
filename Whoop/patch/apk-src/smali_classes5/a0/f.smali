.class public final La0/f;
.super La0/m;
.source "SourceFile"


# instance fields
.field public final synthetic z:La0/g;


# direct methods
.method public constructor <init>(La0/g;)V
    .locals 0

    iput-object p1, p0, La0/f;->z:La0/g;

    iget p1, p1, La0/f1;->y:I

    invoke-direct {p0, p1}, La0/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, La0/f;->z:La0/g;

    invoke-virtual {v0, p1}, La0/f1;->k(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(I)V
    .locals 1

    iget-object v0, p0, La0/f;->z:La0/g;

    invoke-virtual {v0, p1}, La0/f1;->i(I)Ljava/lang/Object;

    return-void
.end method
