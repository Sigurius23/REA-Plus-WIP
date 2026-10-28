.class public final Lv73/g;
.super Lv73/a;
.source "SourceFile"


# instance fields
.field public final E:Ljc/a;

.field public final y:I

.field public final z:Z


# direct methods
.method public constructor <init>(Le83/e;I)V
    .locals 0

    invoke-direct {p0, p1}, Lv73/a;-><init>(Ll73/a;)V

    iput p2, p0, Lv73/g;->y:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lv73/g;->z:Z

    sget-object p1, Lr73/a;->b:Ljc/a;

    iput-object p1, p0, Lv73/g;->E:Ljc/a;

    return-void
.end method


# virtual methods
.method public final c(Ll73/b;)V
    .locals 4

    new-instance v0, Lv73/f;

    iget-boolean v1, p0, Lv73/g;->z:Z

    iget-object v2, p0, Lv73/g;->E:Ljc/a;

    iget v3, p0, Lv73/g;->y:I

    invoke-direct {v0, p1, v3, v1, v2}, Lv73/f;-><init>(Ll73/b;IZLjc/a;)V

    iget-object p1, p0, Lv73/a;->x:Ll73/a;

    invoke-virtual {p1, v0}, Ll73/a;->a(Ll73/b;)V

    return-void
.end method
