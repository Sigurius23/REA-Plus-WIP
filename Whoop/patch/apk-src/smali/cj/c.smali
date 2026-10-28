.class public abstract Lcj/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final E:[Ljava/lang/String;


# instance fields
.field public w:I

.field public x:[I

.field public y:[Ljava/lang/String;

.field public z:[I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x80

    new-array v0, v0, [Ljava/lang/String;

    sput-object v0, Lcj/c;->E:[Ljava/lang/String;

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0x1f

    if-gt v0, v1, :cond_0

    sget-object v1, Lcj/c;->E:[Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const-string v3, "\\u%04x"

    invoke-static {v3, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    sget-object v0, Lcj/c;->E:[Ljava/lang/String;

    const/16 v1, 0x22

    const-string v2, "\\\""

    aput-object v2, v0, v1

    const/16 v1, 0x5c

    const-string v2, "\\\\"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "\\t"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "\\b"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "\\n"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "\\r"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "\\f"

    aput-object v2, v0, v1

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 4

    iget v0, p0, Lcj/c;->w:I

    iget-object v1, p0, Lcj/c;->x:[I

    iget-object v2, p0, Lcj/c;->y:[Ljava/lang/String;

    iget-object v3, p0, Lcj/c;->z:[I

    invoke-static {v0, v1, v3, v2}, Le4/a;->B(I[I[I[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract beginArray()V
.end method

.method public abstract beginObject()V
.end method

.method public abstract endArray()V
.end method

.method public abstract endObject()V
.end method

.method public abstract h()Z
.end method

.method public abstract hasNext()Z
.end method

.method public abstract i()I
.end method

.method public final k(I)V
    .locals 3

    iget v0, p0, Lcj/c;->w:I

    iget-object v1, p0, Lcj/c;->x:[I

    array-length v2, v1

    if-ne v0, v2, :cond_1

    const/16 v2, 0x100

    if-eq v0, v2, :cond_0

    array-length v0, v1

    mul-int/lit8 v0, v0, 0x2

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Lcj/c;->x:[I

    iget-object v0, p0, Lcj/c;->y:[Ljava/lang/String;

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    iput-object v0, p0, Lcj/c;->y:[Ljava/lang/String;

    iget-object v0, p0, Lcj/c;->z:[I

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v0

    iput-object v0, p0, Lcj/c;->z:[I

    goto :goto_0

    :cond_0
    new-instance p1, Lcj/a;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Nesting too deep at "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcj/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcj/c;->x:[I

    iget v1, p0, Lcj/c;->w:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcj/c;->w:I

    aput p1, v0, v1

    return-void
.end method

.method public abstract m(Lwe/o;)I
.end method

.method public abstract nextDouble()D
.end method

.method public abstract nextInt()I
.end method

.method public abstract nextString()Ljava/lang/String;
.end method

.method public abstract s()V
.end method

.method public abstract skipValue()V
.end method

.method public final x(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Lcj/b;

    const-string v1, " at path "

    invoke-static {p1, v1}, Le4/p;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p0}, Lcj/c;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
